package com.livraria.api.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
public class Sumario {
	@NonNull
	@Setter
	private String nome;
	
	@Setter
	@NonNull
	private String numeracao;
	
	@Getter
	List<Sumario> list = new ArrayList<>();
	
	public void add(Sumario sumario) {
		list.add(sumario);
	}
	
	public void remove(Sumario sumario) {
		list.remove(sumario);
	}
	
}
