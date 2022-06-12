import './styles.scss';

interface ContactButtonProps { };
const ContactButton: React.FC<ContactButtonProps> = () => {
    return (
        <button className="contact-button">CONTACT ME</button>
    );
};

export default ContactButton;