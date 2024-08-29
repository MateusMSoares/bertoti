import React, {useState, useEffect} from 'react';
import styles from './Modal.module.css';
import { IoCloseSharp } from "react-icons/io5";

const Modal = ({ closeModal, item, setShowModal, setShouldFetchData }) => {
    
    const [nameValue, setNameValue] = useState("");
    const [thcValue, setThcValue] = useState("");
    const [price, setPrice] = useState("");

    const [disabledButton, setDisabledButton] = useState(true);
    
    useEffect(() => {
        if (item) {
            setNameValue(item.name);
            setThcValue(item.thc);
            setPrice(item.price);
        }
    }, [item]);
    
    useEffect(() => {
        if (nameValue.length > 0 && thcValue.length > 0 && price.length > 0) {
            setDisabledButton(false);
        } else {
            setDisabledButton(true);
        }
    }, [nameValue, thcValue, price]);

    const PutItem = async (e) =>  {
        e.preventDefault();
        try {
            const response = await fetch(`http://localhost:8080/weestore/${item.id}`, {
                method: 'PUT',
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

            if (response.ok) {
                alert('Item editado com sucesso!');
                setShowModal(false);
                setShouldFetchData(true);
            }
        } catch (error) {
            alert('Erro ao cadastrar!');
        }
    }
    
    return (
        <div className={styles.modal}>
            <IoCloseSharp className={styles.iconClose} onClick={closeModal} />
            <h3 className={styles.h3}>Editar produto</h3>
            <form className={styles.form}>
                <div className={styles.divForm}>
                    <p className={styles.labelInputForm}> Nome da genética:</p>
                    <input 
                        type="text" 
                        value={nameValue}
                        className={styles.inputForm}
                        onChange={(e) => setNameValue(e.target.value)}
                    />
                </div>
                <div className={styles.divForm}>
                    <p className={styles.labelInputForm}> Porcentagem THC:</p>
                    <input 
                        type="text" 
                        value={thcValue}
                        className={styles.inputForm}
                        onChange={(e) => setThcValue(e.target.value)}
                    />
                </div>
                <div className={styles.divForm}>
                    <p className={styles.labelInputForm}> preço: </p>
                    <input 
                        type="text" 
                        value={price}
                        className={styles.inputForm}
                        onChange={(e) => setPrice(e.target.value)}
                    />
                </div>
                <button 
                    type="submit" 
                    className={`${styles.button} ${disabledButton ? styles.buttonDisabled : styles.buttonAdd}`}
                    onClick={PutItem}
                    disabled={disabledButton}
                >
                    Atualizar
                </button>
            </form>
        </div>
    );
};

export default Modal;
