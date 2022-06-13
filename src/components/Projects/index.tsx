import AdWave from "./Adwave/Adwave";
import AndFm from "./AndFm/And-fm";

interface ProjectsProps { };
const Projects: React.FC<ProjectsProps> = () => {
    return (
        <section className="projects">
            <h2>PROJECTS</h2>
            <AdWave />
            <AndFm />
        </section>
    );
};

export default Projects;