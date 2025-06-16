package com.example.demo;

import redis.clients.jedis.Jedis;

public class RedisExample {
	
	public static final String CHAVE = "chave";
	
    public void execute(int i) {
        Jedis jedis = new Jedis("localhost", 6379); // Endereço e porta do Redis
        jedis.set(CHAVE, "ISTO É UM TESTE DE ARMAZENAMENTO CHAVE X VALOR - " + System.currentTimeMillis());
        
        String resultado = jedis.get(CHAVE);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("{id: " + i + ", nome: JOSÉ, CPF: 2092934848}");
        
        System.out.println("VALOR ARMAZENADO: " + resultado);
        
        jedis.close();
    }
}