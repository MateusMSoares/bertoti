import React, { useEffect, useState, useCallback } from 'react';
import NavBar from '../components/NavBar/NavBar.component';
import styles from './Home.module.css';
import { FaTrash } from "react-icons/fa";
import { MdEdit } from "react-icons/md";
import Modal from '../components/Modal/Modal.component';
import Music from '../components/Music/Music.component';
import useProductActions from '../hooks/useProductActions';

function Home() {
    const [data, setData] = useState([]);

    const [nameValue, setNameValue] = useState("");
    const [thcValue, setThcValue] = useState("");
    const [price, setPrice] = useState("");

    const [disabledButton, setDisabledButton] = useState(true);

    const [selectedItem, setSelectedItem] = useState(null);
    const [showModal, setShowModal] = useState(false);

    const { 
        PostItem, 
        EditItem, 
        DeleteItem, 
        GetItems, 
        shouldFetchData, 
        setShouldFetchData
    } = useProductActions();

    const fetchItems = useCallback(() => {
        GetItems(setData);
    }, [GetItems]);

    useEffect(() => {
        if (nameValue.length > 0 && thcValue.length > 0 && price.length > 0) {
            setDisabledButton(false);
        } else {
            setDisabledButton(true);
        }
    }, [nameValue, thcValue, price]);

    useEffect(() => {
        if (!shouldFetchData) return;
        fetchItems();
    }, [shouldFetchData, fetchItems]);

    const handlePostItem = (e) => {
        PostItem(
            e, 
            nameValue, 
            thcValue, 
            price, 
            setData, 
            () => setShouldFetchData(true), 
            setNameValue, 
            setThcValue, 
            setPrice
        );
    };

    const handleEdit = (item) => {
        EditItem(
            item, 
            setSelectedItem, 
            setShowModal
        );
    };

    const handleDelete = (id) => {
        DeleteItem(id, setShouldFetchData);
    };

    return (
        <div className={styles.container}>
            <NavBar />
            <div className={styles.subContainer}>
                <section id='Cadastrar' className={styles.sectionAddProduct}>
                    <h2 className={styles.h2Products}>Cadastrar Produto</h2>
                    <div className={styles.containerForm}>
                        <form className={styles.form}>
                            <div className={styles.divForm}>
                                <p className={styles.labelInputForm}> Nome da genética:</p>
                                <input 
                                type="text" 
                                placeholder="Purple haze" 
                                onChange={(e) => setNameValue(e.target.value)}
                                className={styles.inputForm}
                                value={nameValue}
                                />
                            </div>
                            <div className={styles.divForm}>
                                <p className={styles.labelInputForm}> Preço por grama:</p>
                                <input 
                                type="text" 
                                placeholder="R$ 42.00" 
                                onChange={(e) => setThcValue(e.target.value)}
                                className={styles.inputForm}
                                value={thcValue}
                                />
                            </div>
                            <div className={styles.divForm}>
                                <p className={styles.labelInputForm}> Porcentagem de THC: </p>
                                <input 
                                type="text" 
                                placeholder="45%" 
                                onChange={(e) => setPrice(e.target.value)}
                                className={styles.inputForm}
                                value={price}
                                />
                            </div>
                            <button 
                                type="submit" 
                                className={`${styles.button} ${disabledButton ? styles.buttonDisabled : styles.buttonAdd}`}
                                onClick={handlePostItem}
                                disabled={disabledButton}
                            >
                                Cadastrar
                            </button>
                        </form>
                    </div>
                </section>
                <section className={styles.sectionProducts} id='Produtos'>
                    <h2 className={styles.h2}>Produtos</h2>
                    <div className={styles.divItems}>
                        {data.length > 0 ? data.map((item) => (
                        <div key={`${item.id}-${Math.random()}`} className={styles.cardItems}>
                            <h3 className={styles.h3Card}>{item.name}</h3>
                            <p className={styles.paragraphCard}>{item.thc}%</p>
                            <h4 className={styles.h4Card}> R${item.price}</h4>
                            <MdEdit className={styles.iconeEdit} onClick={() => handleEdit(item)}/>
                            <FaTrash className={styles.iconTrash} onClick={() => handleDelete(item.id)}/>
                        </div>
                        )): (
                        <>
                            <p>Não há produtos cadastrados no momento</p>
                        </>
                        )}
                    </div>
                </section>
                {showModal ? (
                <div className={`${styles.cardMapExpanded}`}>
                    <Modal 
                        item={selectedItem} 
                        closeModal={() => setShowModal(false)} 
                        setShowModal={setShowModal}
                        setShouldFetchData={setShouldFetchData}
                    />
                </div>

                ): (
                <div className={`${styles.cardMapCollapsed}`}>
                    <Modal/>
                </div>
                )}
                <Music />
            </div>
        </div>
    );
}

export default Home;
