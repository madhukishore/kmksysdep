package com.kmk.dependency.command;

import java.util.Arrays;

import com.kmk.dependency.model.Program;
import com.kmk.dependency.service.ServiceException;

public class DependCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasMinimumNumberOfArguments(args, 3);

        dependencyManager.depend(new Program(args[1]),
                Program.toProgram(Arrays.copyOfRange(args, 2, args.length)));

        return null;
    }
}
