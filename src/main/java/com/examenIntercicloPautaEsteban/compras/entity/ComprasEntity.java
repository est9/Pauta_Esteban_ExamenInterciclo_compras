package com.examenIntercicloPautaEsteban.compras.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data                        //crea los get y set automaticamente
@AllArgsConstructor            //crea el constructor automaticamente
@NoArgsConstructor        //crea el constructor vacio automaticamente
public class ComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cedula;
    private String codigoProducto;
    private String cantidad;
    private String totalCompra;
}
