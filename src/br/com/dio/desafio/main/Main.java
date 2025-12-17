package br.com.dio.desafio.main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso1 = new Curso();
		 curso1.setTitulo("curso java");
		 curso1.setDescricao("descrição curso java");
		 curso1.setCargaHoraria(32);
		 
		 Curso curso2 = new Curso();
		 curso2.setTitulo("curso de MYSQL");
		 curso2.setDescricao("descrição curso MYSQL");
		 curso2.setCargaHoraria(10);
		 
		 Mentoria mentoria = new Mentoria();
		 mentoria.setTitulo("mentoria java");
		 mentoria.setDescricao("descrição mentoria java");
		 mentoria.setData(LocalDate.now());
		 
		 
		 BootCamp bootCamp = new BootCamp();
		 bootCamp.setNome("bootCamp java Developer");
		 bootCamp.setDescricao("Descrição bootCamp Java Developer");
		 bootCamp.getConteudos().add(curso1);
		 bootCamp.getConteudos().add(curso2);
		 bootCamp.getConteudos().add(mentoria);
		 
		 Dev devCaio = new Dev();
		 devCaio.setNome("caio");
		 devCaio.inscreverBootCamp(bootCamp);
		 System.out.println(devCaio.getConteudoInscritos());
		 devCaio.progredir();
		 System.out.println("------------------");
		 System.out.println(devCaio.getConteudoInscritos());
		 System.out.println("conteudos concluidos" + devCaio.getConteudoConcluido());
		 System.out.println("XP" + devCaio.calcularXp());
		 
		 Dev devCamilla = new Dev();
		 devCamilla.setNome("camilla");
		 devCamilla.inscreverBootCamp(bootCamp);
		 System.out.println(devCamilla.getConteudoInscritos());
		 devCamilla.progredir();
		 System.out.println("------------------");
		 System.out.println(devCamilla.getConteudoInscritos());
		 System.out.println("conteudos concluidos" + devCamilla.getConteudoConcluido());
		 System.out.println("XP" + devCamilla.calcularXp());
		 
	}

}
