package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.springmvc.beans.PhongBan;
import com.springmvc.dao.PhongBanDao;

@Controller
public class PhongBanController {

    @Autowired
    PhongBanDao dao;

    // Hiển thị danh sách phòng ban
    @RequestMapping("/phongban")
    public String viewPhongBan(Model m) {
        List<PhongBan> list = dao.getAllPhongBan();
        m.addAttribute("list", list);
        return "phongban/list";
    }

    // Form thêm phòng ban
    @RequestMapping("/phongban/add")
    public String showAddForm(Model m) {
        m.addAttribute("command", new PhongBan());
        return "phongban/add";
    }

    // Lưu phòng ban mới
    @RequestMapping(value = "/phongban/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("pb") PhongBan pb) {
        dao.save(pb);
        return "redirect:/phongban";
    }

    // Form chỉnh sửa phòng ban
    @RequestMapping("/phongban/edit/{id}")
    public String edit(@PathVariable int id, Model m) {
        PhongBan pb = dao.getPhongBanById(id);
        m.addAttribute("command", pb);
        return "phongban/edit";
    }

    // Lưu chỉnh sửa
    @RequestMapping(value = "/phongban/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("pb") PhongBan pb) {
        dao.update(pb);
        return "redirect:/phongban";
    }

    // Xóa phòng ban
    @RequestMapping("/phongban/delete/{id}")
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/phongban";
    }
}
