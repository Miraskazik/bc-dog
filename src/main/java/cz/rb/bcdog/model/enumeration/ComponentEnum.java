package cz.rb.bcdog.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ComponentEnum {

    BC_CUSTOMER("bc_customer"),
    ;

    private final String componentName;
}
