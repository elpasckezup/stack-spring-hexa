package {{global_computed_inputs.package}}.adapters.outbound.repository;

import {{global_computed_inputs.package}}.ports.outbound.repository.{{inputs.repository_name}}RepositoryPort;

import javax.persistence.EntityManager;

public class {{inputs.repository_name}}Repository implements {{inputs.repository_name}}RepositoryPort {

    private EntityManager manager;

    public {{inputs.repository_name}}Repository(EntityManager manager) {
        this.manager = manager;
    }
}