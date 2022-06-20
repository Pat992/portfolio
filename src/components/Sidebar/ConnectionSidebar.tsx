import Github from "./Github";
import Linkedin from "./Linkedin";

interface ConnectionSidebarProps { };
const ConnectionSidebar: React.FC<ConnectionSidebarProps> = () => {
    return (
        <aside className="sidebar">
            <Github />
            <Linkedin />
        </aside>
    );
};

export default ConnectionSidebar;