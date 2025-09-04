import time

def calcular_vmd(m1, m2, m3):
    media_semanal = (m1 + m2 + m3) / 3
    return media_semanal / 25

def adicionar_item():
    print("Adicionar item")
    produto = input("Digite o nome do produto: ")
    try:
        m1 = float(input("Digite a venda do 1º mês: "))
        m2 = float(input("Digite a venda do 2º mês: "))
        m3 = float(input("Digite a venda do 3º mês: "))
        tr = int(input("Digite o tempo de reposição (TR) em dias: "))
        lr = int(input("Digite o lote de reposição (LR): "))
        ea = int(input("Digite o estoque atual (EA): "))
    except ValueError:
        print("Erro: Insira valores numéricos válidos.")
        time.sleep(2)
        return

    with open("estoque.txt", "a", encoding="utf-8") as arquivo:
        arquivo.write(f'{produto},{m1},{m2},{m3},{tr},{lr},{ea}\n')
    
    print("Item adicionado com sucesso.")
    time.sleep(2)

def venda_media_diaria():
    print("\n--- Venda Média Diária ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            linhas = arquivo.readlines()
            if not linhas:
                print("Estoque vazio.")
                return

            for linha in linhas:
                dados = linha.strip().split(",")
                if len(dados) < 4:
                    print(f"Linha mal formatada: {linha}")
                    continue

                produto = dados[0]
                try:
                    m1 = float(dados[1])
                    m2 = float(dados[2])
                    m3 = float(dados[3])
                except ValueError:
                    print(f"Erro ao converter vendas para o produto {produto}.")
                    continue

                vmd = calcular_vmd(m1, m2, m3)
                print(f"Produto: {produto} | VMD: {vmd:.2f}")
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado. Nenhum item foi cadastrado ainda.")
    time.sleep(2)

def emin():
    print("\n--- Estoque Mínimo (E-min) ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            linhas = arquivo.readlines()
            if not linhas:
                print("Estoque vazio.")
                return

            print(f"{'Produto':<10} | {'TR':<4} | {'VMD':<6} | {'E-min':<6}")
            print("-" * 40)

            for linha in linhas:
                dados = linha.strip().split(",")
                if len(dados) != 7:
                    print(f"Linha mal formatada: {linha}")
                    continue

                produto = dados[0]
                try:
                    m1 = float(dados[1])
                    m2 = float(dados[2])
                    m3 = float(dados[3])
                    tr = int(dados[4])
                except ValueError:
                    print(f"Erro ao processar valores numéricos para {produto}")
                    continue

                vmd = calcular_vmd(m1, m2, m3)
                e_min = tr * vmd

                print(f"{produto:<10} | {tr:<4} | {vmd:<6.2f} | {e_min:<6.2f}")
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado.")
    time.sleep(2)

def emax():
    print("\n--- Estoque Máximo (E-max) ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            linhas = arquivo.readlines()
            if not linhas:
                print("Estoque vazio.")
                return

            print(f"{'Produto':<10} | {'TR':<4} | {'LR':<4} | {'VMD':<6} | {'E-min':<6} | {'E-max':<6}")
            print("-" * 60)

            for linha in linhas:
                dados = linha.strip().split(",")
                if len(dados) != 7:
                    print(f"Linha mal formatada: {linha}")
                    continue

                produto = dados[0]
                try:
                    m1 = float(dados[1])
                    m2 = float(dados[2])
                    m3 = float(dados[3])
                    tr = int(dados[4])
                    lr = int(dados[5])
                except ValueError:
                    print(f"Erro ao processar valores numéricos para {produto}")
                    continue

                vmd = calcular_vmd(m1, m2, m3)
                e_min = tr * vmd
                e_max = e_min + lr

                print(f"{produto:<10} | {tr:<4} | {lr:<4} | {vmd:<6.2f} | {e_min:<6.2f} | {e_max:<6.2f}")
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado.")
    time.sleep(2)

def tomada_de_decisao():
    print("\n--- Tomada de Decisão ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            linhas = arquivo.readlines()
            if not linhas:
                print("Estoque vazio.")
                return

            print(f"{'Produto':<10} | {'EA':<4} | {'E-min':<6} | {'Decisão':<10}")
            print("-" * 40)

            for linha in linhas:
                dados = linha.strip().split(",")
                if len(dados) != 7:
                    print(f"Linha mal formatada: {linha}")
                    continue

                produto = dados[0]
                try:
                    m1 = float(dados[1])
                    m2 = float(dados[2])
                    m3 = float(dados[3])
                    tr = int(dados[4])
                    lr = int(dados[5])  # não usado aqui, mas ok
                    ea = int(dados[6])
                except ValueError:
                    print(f"Erro ao processar valores numéricos para {produto}")
                    continue

                vmd = calcular_vmd(m1, m2, m3)
                e_min = tr * vmd

                decisao = "Não comprar" if ea >= e_min else "Comprar"

                print(f"{produto:<10} | {ea:<4} | {e_min:<6.2f} | {decisao:<10}")
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado.")
    time.sleep(2)

def listar_todos():
    print("\n--- Lista de Todos os Produtos ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            linhas = arquivo.readlines()
            if not linhas:
                print("Estoque vazio.")
                return

            print(f"{'Produto':<15} | {'M1':<6} | {'M2':<6} | {'M3':<6} | {'TR':<4} | {'LR':<4} | {'EA':<4}")
            print("-" * 60)

            for linha in linhas:
                dados = linha.strip().split(",")
                if len(dados) != 7:
                    print(f"Linha mal formatada: {linha}")
                    continue
                
                produto, m1, m2, m3, tr, lr, ea = dados
                print(f"{produto:<15} | {m1:<6} | {m2:<6} | {m3:<6} | {tr:<4} | {lr:<4} | {ea:<4}")
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado.")
    time.sleep(2)

def menu():
    while True:
        print("\n---- MENU ESTOQUE ----")
        print("1 - Adicione um produto")
        print("2 - Venda média diária")
        print("3 - Emin")
        print("4 - Emax")
        print("5 - Tomada de decisão")
        print("6 - Sair")
        print("7 - Listar todos os produtos")  # nova opção

        try:
            opcao = int(input("Escolha uma opção: "))
        except ValueError:
            print("Por favor, digite um número válido.")
            continue

        if opcao == 1:
            adicionar_item()
        elif opcao == 2:
            venda_media_diaria()
        elif opcao == 3:
            emin()
        elif opcao == 4:
            emax()
        elif opcao == 5:
            tomada_de_decisao()
        elif opcao == 6:
            print("Saindo do sistema...")
            break
        elif opcao == 7:
            listar_todos()
        else:
            print("Opção inválida. Tente novamente.")

menu()
