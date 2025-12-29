import random

def gerar_senha():
    letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    numeros = "0123456789"
    simbolos = "!@#$%&*"

    todos = letras + numeros + simbolos

    tamanho = int(input("Digite o tamanho da senha: "))
    senha = ""

    for _ in range(tamanho):
        senha += random.choice(todos)

    return senha


if __name__ == "__main__":
    print("Gerador de Senhas Simples")
    print("-" * 25)

    senha_gerada = gerar_senha()
    print("Senha gerada:", senha_gerada)
