package com.springmvc.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.PvvHopDong;
import com.springmvc.dao.PvvHopDongDao;
import com.springmvc.dao.PvvNhanVienDao;

@Controller
@RequestMapping("/hopdong")
public class PvvHopDongController {

    @Autowired
    PvvHopDongDao pvvHopDongDao;

    @Autowired
    PvvNhanVienDao pvvNhanVienDao;
    

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


    @RequestMapping("/list")
    public String listHopDong(Model model) {
        List<PvvHopDong> list = pvvHopDongDao.getAllHopDong();
        model.addAttribute("listHopDong", list);
        return "hopdong/list";
    }

    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("hopDong", new PvvHopDong());
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "hopdong/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveHopDong(@ModelAttribute("hopDong") PvvHopDong pvvHopDong) {
        pvvHopDongDao.save(pvvHopDong);
        return "redirect:/hopdong/list";
    }

    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("hopDong", pvvHopDongDao.getHopDongById(id));
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "hopdong/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateHopDong(@ModelAttribute("hopDong") PvvHopDong pvvHopDong) {
        pvvHopDongDao.update(pvvHopDong);
        return "redirect:/hopdong/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteHopDong(@PathVariable int id) {
        pvvHopDongDao.delete(id);
        return "redirect:/hopdong/list";
    }
   

}
