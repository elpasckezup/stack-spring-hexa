
    @Bean
    public {{inputs.repository_name}}RepositoryPort {{inputs.repository_name | lower}}Repository(EntityManager manager) {
        return new {{inputs.repository_name}}Repository(manager);
    }
