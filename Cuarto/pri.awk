# Función que determina si un número es primo
function es_primo(n) {
    if (n <= 1) return 0;
    for (i = 2; i <= int(sqrt(n)); i++) {
        if (n % i == 0) return 0;
    }
    return 1;
}

# Procesar cada número en el archivo
{
    if (es_primo($1)) {
        print $1 " es primo.";
    }
}
