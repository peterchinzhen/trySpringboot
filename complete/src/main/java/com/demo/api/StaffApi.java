package com.demo.api;

import com.demo.entity.Staff;
import com.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ZhenYang on 2017/02/19.
 */
@RequestMapping("/staff")
@RestController
public class StaffApi {
    @Autowired
    StaffService staffService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Staff> listStaffs() {
        return staffService.listAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Staff getStaffById(@PathVariable int id) {
        return staffService.getStaffById(id);
    }
}
