import { ReactHTML, ReactNode } from "react";

interface DescriptionCardProps {
    title: string,
    technologies: Array<ReactNode>,
    description: string,
    links: Array<ReactNode>,
    isLeft: boolean
};
const DescriptionCard: React.FC<DescriptionCardProps> = ({ title, technologies, description, links, isLeft = true }) => {
    return (
        <div className="description-card">
            <h2>{title}</h2>
            <h4>Technologies:</h4>
            <ul>
                {
                    technologies.map(technology => <li>{technology}</li>)
                }
            </ul>
            <h4>Description:</h4>
            <p>{description}</p>
            <h4>Links:</h4>
            <ul>
                {
                    links.map(link => <li>{link}</li>)
                }
            </ul>
        </div>
    );
};

export default DescriptionCard;