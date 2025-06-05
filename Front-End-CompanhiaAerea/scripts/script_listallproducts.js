function clearLoading(){
    document.getElementById("loading").style.display = "none";
}
async function getproductbyid() {
    const formE1 = document.querySelector("#formid");
    const formData = new FormData(formE1);
const url = "http://localhost:8080/produto/list/"+formData.get("id");
    const dados = await fetch(url, {method: "GET"});
    if(dados.status === 200){
        const products = await dados.json();
        if(products){
            clearLoading();
        }
        showProducts([products]);
    }

}

function showProducts(products){
    let tab = ` <thead>
        <th>id</th>
        <th>Preço</th>
        <th>Descrição</th>
        <th>Cliente</th>
        <th>Produto</th>
        <th>Quantidade</th>
        <th>Peso</th>
        <th>Tamanho</th>
        <th>Fornecedor</th>
        <th>Frete</th>
        <th>Editar</th>
        <th>Remover</th>
    </thead>`;

    for(let product of products){
        tab += `
            <tr>
                <td>${product.id}</td>
                <td>${product.preco}</td>
                <td>${product.descricao}</td>
                <td>${product.cliente}</td>
                <td>${product.produto}</td>
                <td>${product.quantidade}</td>
                <td>${product.peso}</td>
                <td>${product.tamanho}</td>
                <td>${product.fornecedor}</td>
                <td>${product.frete}</td>
                <td><a href=${"editproduct.html?id=" +product.id}><img src="images/edit01.png" width="20" height="15"></a></td>
                <td><button onclick=${'deleteproduct('+product.id+')'}><img src="images/trash01.png" width="20" height="15"></button></td>
            </tr>
        `;
    }
    document.getElementById("products").innerHTML = tab;
}

async function listAllProducts(){
    const url = "http://localhost:8080/produto/listall";
    const dados = await fetch(url, {method: "GET"});
    if(dados.status === 200){
        const products = await dados.json();
        if(products){
            clearLoading();
        }
        showProducts(products);
    }
}

listAllProducts();

async function deleteproduct(id){
const url = "http://localhost:8080/produto/delete/"+id;
    const dados = await fetch(url, {method: "DELETE"});
    if(dados.status === 204){
        alert('Deletado com Sucesso!')
    }
    else {
    alert ('Erro!')
    }
    document.location.href='listallproducts.html'
}
