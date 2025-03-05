package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.DanhGia;
import com.springmvc.dao.DanhGiaDao;
import com.springmvc.dao.NhanVienDao;

@Controller
@RequestMapping("/danhgia")
public class DanhGiaController {

    @Autowired
    DanhGiaDao danhGiaDao;

    @Autowired
    NhanVienDao nhanVienDao;

    // Hiển thị danh sách đánh giá
    @RequestMapping("/list")
    public String listDanhGia(Model model) {
        List<DanhGia> list = danhGiaDao.getAllDanhGia();
        model.addAttribute("listDanhGia", list);
        return "danhgia/list";
    }

    // Hiển thị form thêm đánh giá
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("danhGia", new DanhGia());
        model.addAttribute("listNhanVien", nhanVienDao.getAllNhanViens());
        return "danhgia/add";
    }

    // Xử lý thêm đánh giá
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDanhGia(@ModelAttribute("danhGia") DanhGia danhGia) {
        danhGiaDao.save(danhGia);
        return "redirect:/danhgia/list";
    }

    // Hiển thị form sửa đánh giá
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        DanhGia danhGia = danhGiaDao.getDanhGiaById(id);
        model.addAttribute("danhGia", danhGia);
        model.addAttribute("listNhanVien", nhanVienDao.getAllNhanViens());
        return "danhgia/edit";
    }

    // Xử lý cập nhật đánh giá
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateDanhGia(@ModelAttribute("danhGia") DanhGia danhGia) {
        danhGiaDao.update(danhGia);
        return "redirect:/danhgia/list";
    }

    // Xóa đánh giá
    @RequestMapping("/delete/{id}")
    public String deleteDanhGia(@PathVariable int id) {
        danhGiaDao.delete(id);
        return "redirect:/danhgia/list";
    }
}
