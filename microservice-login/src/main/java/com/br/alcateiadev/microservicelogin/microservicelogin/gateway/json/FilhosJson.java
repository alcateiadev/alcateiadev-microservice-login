package com.br.alcateiadev.microservicelogin.microservicelogin.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilhosJson {
    private String uuid;
    private String name;
}
