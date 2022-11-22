package com.livraria.api.entities;
 

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Autor {

	private String nome;
	
	private Date nascimento;
	
	private Date falecimento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
}
