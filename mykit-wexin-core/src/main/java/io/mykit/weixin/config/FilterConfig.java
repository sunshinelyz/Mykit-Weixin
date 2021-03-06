/**
 * Copyright 2018-2118 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.weixin.config;

import io.mykit.weixin.filter.VisitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyazhuang
 * @date 2018/10/11 17:57
 * @description 过滤器配置
 * @version 1.0.0
 */
//@Configuration
//public class FilterConfig {
//
//    @Bean
//    public FilterRegistrationBean visitFilterRegistrationBean(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setName("visitFilter");
//        VisitFilter visitFilter = new VisitFilter();
//        registrationBean.setFilter(visitFilter);
//        registrationBean.setOrder(1);
//        List<String> urlList = new ArrayList<String>();
//        urlList.add("/*");
//        registrationBean.setUrlPatterns(urlList);
//        return registrationBean;
//    }
//}
