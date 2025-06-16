package com.example.demo;

import redis.clients.jedis.Jedis;

public class RedisExample {
    public void execute() {
        Jedis jedis = new Jedis("localhost", 6379); // Endereço e porta do Redis
        jedis.set("chave", "valor");
        String valor = jedis.get("chave");
        System.out.println("Valor obtido: " + valor);
        jedis.close();
    }
}