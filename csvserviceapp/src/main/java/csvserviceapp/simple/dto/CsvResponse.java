/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvserviceapp.simple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Vyor
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CsvResponse {
    public String id;
    public String xmlResult;
}
