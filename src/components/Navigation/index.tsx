import './index.scss';

interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    return (
        <nav>
            <div>Logo</div>
            <ul>
                <li><a href="#">HOME</a></li>
                <li><a href="#">PROJECTS</a></li>
                <li><a href="#">SKILLS</a></li>
            </ul>
        </nav>
    );
};

export default Nav