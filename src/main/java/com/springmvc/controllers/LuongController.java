package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.Luong;
import com.springmvc.dao.LuongDao;
import com.springmvc.dao.NhanVienDao;

@Controller
@RequestMapping("/luong")
public class LuongController {

    @Autowired
    LuongDao luongDao;

    @Autowired
    NhanVienDao nhanVienDao;

    // Hiển thị danh sách lương
    @RequestMapping("/list")
    public String listLuong(Model model) {
        List<Luong> list = luongDao.getAllLuong();
        model.addAttribute("listLuong", list);
        return "luong/list";
    }

    // Hiển thị form thêm lương
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("luong", new Luong());
        model.addAttribute("listNhanVien", nhanVienDao.getAllNhanViens());
        return "luong/add";
    }

    // Xử lý thêm lương
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveLuong(@ModelAttribute("luong") Luong luong) {
        luongDao.save(luong);
        return "redirect:/luong/list";
    }

    // Hiển thị form sửa lương
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Luong luong = luongDao.getLuongById(id);
        model.addAttribute("luong", luong);
        model.addAttribute("listNhanVien", nhanVienDao.getAllNhanViens());
        return "luong/edit";
    }

    // Xử lý cập nhật lương
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateLuong(@ModelAttribute("luong") Luong luong) {
        luongDao.update(luong);
        return "redirect:/luong/list";
    }

    // Xóa lương
    @RequestMapping("/delete/{id}")
    public String deleteLuong(@PathVariable int id) {
        luongDao.delete(id);
        return "redirect:/luong/list";
    }
}
