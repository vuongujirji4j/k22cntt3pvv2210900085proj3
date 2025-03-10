package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.PvvDanhGia;
import com.springmvc.dao.PvvDanhGiaDao;
import com.springmvc.dao.PvvNhanVienDao;

@Controller
@RequestMapping("/danhgia")
public class PvvDanhGiaController {

    @Autowired
    PvvDanhGiaDao pvvDanhGiaDao;

    @Autowired
    PvvNhanVienDao pvvNhanVienDao;

    // Hiển thị danh sách đánh giá
    @RequestMapping("/list")
    public String listDanhGia(Model model) {
        List<PvvDanhGia> list = pvvDanhGiaDao.getAllDanhGia();
        model.addAttribute("listDanhGia", list);
        return "danhgia/list";
    }

    // Hiển thị form thêm đánh giá
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("danhGia", new PvvDanhGia());
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "danhgia/add";
    }

    // Xử lý thêm đánh giá
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDanhGia(@ModelAttribute("danhGia") PvvDanhGia pvvDanhGia) {
        pvvDanhGiaDao.save(pvvDanhGia);
        return "redirect:/danhgia/list";
    }

    // Hiển thị form sửa đánh giá
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        PvvDanhGia pvvDanhGia = pvvDanhGiaDao.getDanhGiaById(id);
        model.addAttribute("danhGia", pvvDanhGia);
        model.addAttribute("listNhanVien", pvvNhanVienDao.getAllNhanViens());
        return "danhgia/edit";
    }

    // Xử lý cập nhật đánh giá
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateDanhGia(@ModelAttribute("danhGia") PvvDanhGia pvvDanhGia) {
        pvvDanhGiaDao.update(pvvDanhGia);
        return "redirect:/danhgia/list";
    }

    // Xóa đánh giá
    @RequestMapping("/delete/{id}")
    public String deleteDanhGia(@PathVariable int id) {
        pvvDanhGiaDao.delete(id);
        return "redirect:/danhgia/list";
    }
}