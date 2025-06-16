package com.example.demo;

import redis.clients.jedis.Jedis;

public class RedisExample {
	
	public static final String CHAVE = "chave";
	
    public void execute(int i) {
        Jedis jedis = new Jedis("localhost", 6379); // Endereço e porta do Redis
        jedis.set(CHAVE, "VALOR ARMAZENAMENTO CHAVE X VALOR - " + "{id: " + i + ", nome: JOSÉ, CPF: 2092934848}");
        
        String resultado = jedis.get(CHAVE).split("-")[1];
        
        System.out.println(">>>>> VALOR RECEBIDO: " + resultado);
        
        jedis.close();
    }
}