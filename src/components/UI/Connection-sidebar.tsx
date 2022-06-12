import Github from "./Github";
import Linkedin from "./Linkedin";

interface ConnectionSidebarProps { };
const ConnectionSidebar: React.FC<ConnectionSidebarProps> = () => {
    return (
        <aside>
            <Github />
            <Linkedin />
        </aside>
    );
};

export default ConnectionSidebar;