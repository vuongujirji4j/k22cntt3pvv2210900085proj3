package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.PvvLuong;
import com.springmvc.dao.PvvLuongDao;
import com.springmvc.dao.PvvNhanVienDao;

@Controller
@RequestMapping("/luong")
public class PvvLuongController {

    @Autowired
    PvvLuongDao pvvLuongDao;

    @Autowired
    PvvNhanVienDao pvvNhanVienDao;

    // Hiển thị danh sách lương
    @RequestMapping("/list")
    public String listLuong(Model model) {
        List<PvvLuong> list = pvvLuongDao.getAllLuong();
        model.addAttribute("listLuong", list);
        return "luong/list";
    }

    // Hiển thị form thêm lương
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("luong", new PvvLuong());
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "luong/add";
    }

    // Xử lý thêm lương
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveLuong(@ModelAttribute("luong") PvvLuong pvvLuong) {
        pvvLuongDao.save(pvvLuong);
        return "redirect:/luong/list";
    }

    // Hiển thị form sửa lương
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        PvvLuong pvvLuong = pvvLuongDao.getLuongById(id);
        model.addAttribute("luong", pvvLuong);
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "luong/edit";
    }

    // Xử lý cập nhật lương
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateLuong(@ModelAttribute("luong") PvvLuong pvvLuong) {
        pvvLuongDao.update(pvvLuong);
        return "redirect:/luong/list";
    }

    // Xóa lương
    @RequestMapping("/delete/{id}")
    public String deleteLuong(@PathVariable int id) {
        pvvLuongDao.delete(id);
        return "redirect:/luong/list";
    }
}
