package com.proyectum.users.application.command.role;

import com.proyectum.cqrs.commad.CommandHandler;
import com.proyectum.users.domain.command.role.DeletePermissionCommand;
import com.proyectum.users.domain.usecase.role.DeleteRolePermissionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteRolePermissionCommandHandler implements CommandHandler<DeletePermissionCommand, Void> {

    private final DeleteRolePermissionUseCase deleteRolePermissionUseCase;

    @Override
    public Void handle(DeletePermissionCommand command) {
        deleteRolePermissionUseCase.deletePermission(command);
        return null;
    }
}
