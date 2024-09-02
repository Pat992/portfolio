import { motion } from 'framer-motion';

interface NavigationItemProps {
    child: any,
    selected: boolean,
    onHover: Function,
    onLeave: Function
};
const NavigationItem: React.FC<NavigationItemProps> = ({ child, selected, onHover, onLeave }) => {
    return (
        <motion.div
            className="menu-item"
            onHoverStart={() => onHover()}
            onHoverEnd={() => onLeave()}
            animate={{ opacity: selected ? 1 : .5 }}
        >
            {child}
            {selected && (
                <motion.div
                    className="underline"
                    layoutId="underline"
                />
            )}
        </motion.div>
    );
};

export default NavigationItem;