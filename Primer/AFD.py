import re
import sys

def detectar_token(expresion):
    if re.fullmatch(r'\+', expresion):
        return "SUMA"
    elif re.fullmatch(r'\+\+', expresion):
        return "DOBLE SUMA"
    elif re.fullmatch(r'[0-9]+', expresion):
        return "ENTERO"
    elif re.fullmatch(r'[0-9]+\.[0-9]+', expresion):
        return "DECIMAL"
    else:
        return "EXPRESIÓN NO RECONOCIDA"

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Uso: python AFD.py <expresión>")
        sys.exit(1)
    
    expresion = sys.argv[1]
    token = detectar_token(expresion)
    print(token)
