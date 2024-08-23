import { useState, useCallback } from 'react';

const useProductActions = () => {
    const [shouldFetchData, setShouldFetchData] = useState(true);

    const GetItems = useCallback(async (setData) => {
        try {
            const response = await fetch('http://localhost:8080/weestore', {
                method: 'GET',
                headers: {
                'Content-Type': 'application/json',
                },
            });
            
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }

            const result = await response.json();
            console.log(result)
            setData(result);
            setShouldFetchData(false);
        } catch (error) {
            console.log('error', error);
        }
    }, []);

    const PostItem = async (
        e, 
        nameValue, 
        thcValue, 
        price, 
        setShouldFetchData, 
        setNameValue, 
        setThcValue, 
        setPrice
        ) => {
        e.preventDefault();
        try {
            console.log(nameValue, thcValue, price)
            const response = await fetch('http://localhost:8080/weestore', {
                method: 'POST',
                body: JSON.stringify({
                name: nameValue,  
                thc: thcValue,
                price: price
                }),
                headers: {
                    'Content-Type': 'application/json',
                }}
            );
        
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }

            alert('Item Cadastrado com sucesso!');
            setShouldFetchData(true);
            setNameValue("");
            setThcValue("");
            setPrice("");
        } catch (error) {
            alert('Erro ao cadastrar!');
        }
    };

    const EditItem = async (item, setSelectedItem, setShowModal) => {
        try {
            const response = await fetch(`http://localhost:8080/weestore/${item.id}`, {
                method: 'GET',
                headers: {
                'Content-Type': 'application/json',
                },
            });

            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }

            const result = await response.json();
            setSelectedItem(result);
            setShowModal(true);
        } catch (error) {
            console.log('error', error);
        }
    };

    const DeleteItem = async (id, setShouldFetchData) => {
        try {
            const response = await fetch(`http://localhost:8080/weestore/${id}`, {
                method: 'DELETE',
                headers: {
                'Content-Type': 'application/json',
                }}
            );
            
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }

            alert('Item excluído com sucesso!');
            setShouldFetchData(true); 
        } catch (error) {
            alert('Erro ao excluir!');
        }
    };

  return { GetItems, PostItem, EditItem, DeleteItem, shouldFetchData, setShouldFetchData };
};

export default useProductActions;
