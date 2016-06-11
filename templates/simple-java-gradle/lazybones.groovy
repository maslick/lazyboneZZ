def props = [:]
props.version = ask("Define value for 'project_name' [project]: ", "project", "project_name")
props.group = ask("Define value for 'group' [com.maslick.{helloworld]: ", "helloworld", "group")
props.version = ask("Define value for 'version' [0.1]: ", "0.1", "version")


processTemplates "build.gradle", props
