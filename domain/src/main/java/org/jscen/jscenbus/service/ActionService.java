package org.jscen.jscenbus.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.jscen.jscenbus.dao.ActionDao;
import org.jscen.jscenbus.entity.Action;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionService {

    private final ActionDao actionDao;

    @Transactional
    public List<Action> getAll() {
        return actionDao.findAll();
    }
}
