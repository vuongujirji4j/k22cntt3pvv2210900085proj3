package com.springmvc.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.PvvDonNghiPhep;
import com.springmvc.dao.PvvDonNghiPhepDao;

@Controller
@RequestMapping("/donnghiphep")
public class PvvDonNghiPhepController {

    @Autowired
    PvvDonNghiPhepDao pvvDonNghiPhepDao;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping("/list")
    public String listDonNghiPhep(Model model) {
        List<PvvDonNghiPhep> list = pvvDonNghiPhepDao.getAll();
        model.addAttribute("listDonNghiPhep", list);
        return "donnghiphep/list";
    }

    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("donNghiPhep", new PvvDonNghiPhep());
        return "donnghiphep/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDonNghiPhep(@ModelAttribute("donNghiPhep") PvvDonNghiPhep don) {
        don.setPvv_TrangThai("Chờ duyệt");
        pvvDonNghiPhepDao.save(don);
        return "redirect:/donnghiphep/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteDonNghiPhep(@PathVariable int id) {
        pvvDonNghiPhepDao.delete(id);
        return "redirect:/donnghiphep/list";
    }
}
