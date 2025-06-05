
async function editProduct(){
    const formE1 = document.querySelector("#formedit");
    const formData = new FormData(formE1);
    const product = Object.fromEntries(formData);
    const params = new URLSearchParams(location.search)
    const id = params.get('id')
    product['id'] = id
    console.log(product)
    const url = "http://localhost:8080/produto/update";
    const option = {
        method: 'PUT',
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(product)
    }
    const result = await fetch(url, option);
    if(result.status === 200){

        alert('Editado com sucesso!');
        document.location.href='listallproducts.html'
    }
    else{
        alert('Erro ao editar.');
    }
}

async function showedit(){
const params = new URLSearchParams(location.search)
const id = params.get('id')
const url = "http://localhost:8080/produto/list/"+id
    const dados = await fetch(url, {method: "GET"});
    if(dados.status === 200){
        const product = await dados.json();
        const fields = ['preco', 'descricao', 'cliente', 'produto', 'quantidade', 'peso', 'tamanho', 'fornecedor', 'frete']
        for (field of fields){
        document.getElementById(field).value=product[field]
        }
        }
}
showedit()