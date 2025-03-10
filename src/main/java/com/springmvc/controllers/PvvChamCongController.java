package com.springmvc.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.beans.PvvChamCong;
import com.springmvc.dao.PvvChamCongDao;
import com.springmvc.dao.PvvNhanVienDao;

@Controller
@RequestMapping("/chamcong")
public class PvvChamCongController {

    @Autowired
    PvvChamCongDao pvvChamCongDao;

    @Autowired
    PvvNhanVienDao pvvNhanVienDao;
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, true));
    }


    // Hiển thị danh sách chấm công
    @RequestMapping("/list")
    public String listChamCong(Model model) {
        List<PvvChamCong> list = pvvChamCongDao.getAllChamCong();
        model.addAttribute("listChamCong", list);
        return "chamcong/list";
    }

    // Hiển thị form thêm chấm công
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("chamCong", new PvvChamCong());
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "chamcong/add";
    }

    // Xử lý thêm chấm công
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveChamCong(@ModelAttribute("chamCong") PvvChamCong pvvChamCong) {
        pvvChamCongDao.save(pvvChamCong);
        return "redirect:/chamcong/list";
    }

    // Hiển thị form sửa chấm công
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        PvvChamCong pvvChamCong = pvvChamCongDao.getChamCongById(id);
        model.addAttribute("chamCong", pvvChamCong);
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "chamcong/edit";
    }

    // Xử lý cập nhật chấm công
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateChamCong(@ModelAttribute("chamCong") PvvChamCong pvvChamCong) {
        pvvChamCongDao.update(pvvChamCong);
        return "redirect:/chamcong/list";
    }

    // Xóa chấm công
    @RequestMapping("/delete/{id}")
    public String deleteChamCong(@PathVariable int id) {
        pvvChamCongDao.delete(id);
        return "redirect:/chamcong/list";
    }
}