
    @Bean
    public {{inputs.usecase_name}}UseCasePort {{inputs.usecase_name | lower}}UseCase() {
        return new {{inputs.usecase_name}}UseCase();
    }
