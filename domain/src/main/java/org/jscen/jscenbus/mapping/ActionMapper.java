package org.jscen.jscenbus.mapping;

import lombok.RequiredArgsConstructor;
import org.jscen.jscenbus.dto.ActionDto;
import org.jscen.jscenbus.entity.Action;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ActionMapper {

    private final ModelMapper modelMapper;

    public ActionDto mapToDto(Action action) {
        return modelMapper.map(action, ActionDto.class);
    }

    public Action mapFromDto(ActionDto actionDto) {
        return modelMapper.map(actionDto, Action.class);
    }
}
