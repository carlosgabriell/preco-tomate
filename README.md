# 📦 preco-tomate

Serviço REST que calcula o preço total de uma encomenda de caixas de tomate com base na quantidade, aplicando descontos por volume.

## 🚀 Como rodar

```bash
cd preco-tomate
mvn spring-boot:run
```

## ✅ Endpoint

- **POST /preco**  
  Recebe a quantidade de caixas de tomate e retorna o preço com desconto aplicado.

### 📥 Exemplo de entrada:

```json
{
  "quantidade": 25
}
```

### 📤 Exemplo de resposta:

```json
{
  "precoFinal": 1112.5
}
```