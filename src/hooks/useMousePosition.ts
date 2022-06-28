import { useState, useEffect } from "react";

export const useMousePosition = () => {
    const [mousePos, setMousePos] = useState({ posX: 0, posY: 0 });
    useEffect(() => {
        const getMousePos = (e: any) => {
            const rect = e.target.getBoundingClientRect();
            const posX: number = e.clientX - rect.left;
            const posY: number = e.clientY - rect.top;
            setMousePos({ posX, posY });
            console.log(mousePos);
            console.log(e.clientX);
            console.log(rect.left);
            console.log(rect.top);
        };
        document.addEventListener("mousemove", getMousePos);
        return function cleanup() {
            document.removeEventListener("mousemove", getMousePos);
        };
    });
    return mousePos;
};
