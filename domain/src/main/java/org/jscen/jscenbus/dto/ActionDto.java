package org.jscen.jscenbus.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link org.jscen.jscenbus.entity.Action}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionDto implements Serializable {
    private Long id;
    @Size(message = "Label cannot be larger than 64 symbols", max = 64)
    @NotBlank
    private String label;
    @Size(message = "Description cannot be larger than 256 symbols", max = 256)
    private String description;
    @Size(message = "Name cannot be larger than 64 symbols", max = 64)
    @NotBlank
    private String name;
    private String icon;
}