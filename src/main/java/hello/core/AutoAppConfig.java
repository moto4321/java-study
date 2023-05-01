package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 이렇게 하면 member만 컴포넌트스캔의 대상이된다.
        basePackageClasses = AutoAppConfig.class,
        // 위 두 줄을 지정하지 않으면 hello.core를 뒤진다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
