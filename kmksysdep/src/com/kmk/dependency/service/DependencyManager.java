package com.kmk.dependency.service;

import java.util.Set;

import com.kmk.dependency.model.Program;

public interface DependencyManager {
    Set<Program> list() throws ServiceException;

    void depend(Program source, Set<Program> dest) throws ServiceException;

    Set<Program> add(Program program) throws ServiceException;

    Set<Program> remove(Program program) throws ServiceException;
}
