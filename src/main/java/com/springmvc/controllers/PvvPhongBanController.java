package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.springmvc.beans.PvvPhongBan;
import com.springmvc.dao.PvvPhongBanDao;

@Controller
public class PvvPhongBanController {

    @Autowired
    PvvPhongBanDao dao;

    // Hiển thị danh sách phòng ban
    @RequestMapping("/phongban")
    public String viewPhongBan(Model m) {
        List<PvvPhongBan> list = dao.getAllPhongBan();
        m.addAttribute("list", list);
        return "phongban/list";
    }

    // Form thêm phòng ban
    @RequestMapping("/phongban/add")
    public String showAddForm(Model m) {
        m.addAttribute("command", new PvvPhongBan());
        return "phongban/add";
    }

    // Lưu phòng ban mới
    @RequestMapping(value = "/phongban/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("pb") PvvPhongBan pb) {
        dao.save(pb);
        return "redirect:/phongban";
    }

    // Form chỉnh sửa phòng ban
    @RequestMapping("/phongban/edit/{id}")
    public String edit(@PathVariable int id, Model m) {
        PvvPhongBan pb = dao.getPhongBanById(id);
        m.addAttribute("command", pb);
        return "phongban/edit";
    }

    // Lưu chỉnh sửa
    @RequestMapping(value = "/phongban/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("pb") PvvPhongBan pb) {
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
