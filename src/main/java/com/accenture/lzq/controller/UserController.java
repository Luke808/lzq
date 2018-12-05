package com.accenture.lzq.controller;

import com.accenture.lzq.model.Group;
import com.accenture.lzq.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = {"增删改查"},description = "增删改查")
@RestController
@RequestMapping
public class UserController{
    @Autowired
    private UserService userService;
    @ApiOperation(value = "查找",notes = "查找")
    @ApiImplicitParams(
          value =  {
                @ApiImplicitParam(name = "id",value = "用户id",required = true)
            }
    )
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Group find(@RequestParam("id") String id){
        return userService.selectByPrimaryKey(id);
    }
    @ApiOperation(value = "添加",notes = "添加")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "id",value = "号码"),
                    @ApiImplicitParam(name = "name",value = "姓名")
            }
    )
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(Group record){
        return userService.insertSelective(record);
    }
    @ApiOperation(value = "修改",notes = "修改")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "id",value = "号码"),
                    @ApiImplicitParam(name = "name",value = "姓名")
            }
    )
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(Group record){
        return userService.updateByPrimaryKeySelective(record);
    }
    @ApiOperation(value = "删除",notes = "删除")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "id",value = "号码"),
                    @ApiImplicitParam(name = "name",value = "姓名")
            }
    )
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int delete(String id){
        return userService.deleteByPrimaryKey(id);
    }
}
