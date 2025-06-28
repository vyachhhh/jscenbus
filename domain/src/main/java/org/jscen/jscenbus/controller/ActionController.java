package org.jscen.jscenbus.controller;

import lombok.RequiredArgsConstructor;
import org.jscen.jscenbus.api.rest.ActionApiRest;
import org.jscen.jscenbus.dto.ActionDto;
import org.jscen.jscenbus.mapping.ActionMapper;
import org.jscen.jscenbus.service.ActionService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActionController implements ActionApiRest {

    private final ActionService actionService;
    private final ActionMapper actionMapper;

    @Override
    public List<ActionDto> findAll() {
        return actionService.getAll()
                .stream()
                .map(actionMapper::mapToDto)
                .sorted(Comparator.comparing(ActionDto::getId))
                .toList();
    }

    @Override
    public ActionDto findById(Long id) {
        return null;
    }

    @Override
    public ActionDto findByName(String name) {
        return null;
    }
}
