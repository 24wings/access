package com.fastsun.access.controller;

import com.fastsun.access.bean.LoginBean;
import com.fastsun.access.bean.Res;
import com.fastsun.access.entity.App;
import com.fastsun.access.entity.Developer;
import com.fastsun.access.service.jpa.AppJpa;
import com.fastsun.access.service.jpa.DeveloperJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class AccessController {
    @Autowired
    DeveloperJpa devJpa;
    @Autowired
    AppJpa appJpa;

    @PostMapping("/access/dev/login")
    public Res devLogin(@RequestBody LoginBean loginBean) {
        Developer dev = devJpa.findTop1ByUsername(loginBean.getUsername());
        if (dev != null) {
            if (dev.getPassword().equals(loginBean.getPassword())) {
                return Res.success().put("dev", dev);
            } else {
                return Res.error(400, "密码错误");
            }

        } else {
            return Res.error(400, "开发者不存在");

        }
    }

    @PostMapping("/access/dev/signup")
    public Res devSignup(@RequestBody Developer dev) {
        Developer newDev = this.devJpa.save(dev);
        return Res.success().put("dev", newDev);
    }

    @PostMapping("/access/dev/app/list")
    public Res devAppList(@RequestParam Integer devId) {
        java.util.List<App> apps = appJpa.findByDevId(devId);
        return Res.success().put("apps", apps);
    }

}