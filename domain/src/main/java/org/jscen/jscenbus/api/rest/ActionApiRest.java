package org.jscen.jscenbus.api.rest;

import org.jscen.jscenbus.dto.ActionDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("api/v1/action")
public interface ActionApiRest {

    @GetMapping(value="/")
    List<ActionDto> findAll();

    @GetMapping(value = "/id", params = "id")
    ActionDto findById(@RequestParam Long id);

    @GetMapping(value = "/name", params = "name")
    ActionDto findByName(@RequestParam String name);
}
