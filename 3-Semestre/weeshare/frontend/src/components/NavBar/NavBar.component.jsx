import React, {  useState, useRef} from 'react';
import styles from './NavBar.module.css';
import logo from '../../assets/weestore.jpeg';

const NavBar = () => {

    const scrollToSection = (sectionId) => {
        const section = document.getElementById(sectionId);
        if (section) {
            section.scrollIntoView({ behavior: 'smooth' });
        }
    };

    return (
        <div className={styles.container}>
            <div className={styles.divTitle}>
                <img src={logo} className={styles.logo}/>
            </div>
            <nav className={styles.nav}>
                <button className={styles.button} onClick={() => scrollToSection('Cadastrar')}>Cadastrar produto</button>
                <button className={styles.button} onClick={() => scrollToSection('Produtos')}>Produtos</button>
            </nav>                
        </div>
    );
};

export default NavBar;