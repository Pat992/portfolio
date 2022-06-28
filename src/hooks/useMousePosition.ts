import { useState, useEffect, MutableRefObject } from "react";

export const useMousePosition = (ref: any) => {
    const [mousePos, setMousePos] = useState({ posX: 0, posY: 0 });
    useEffect(() => {
        const getMousePos = (e: any) => {
            const rect = ref.current.getBoundingClientRect();
            const posX: number = (e.clientX - rect.left) / rect.width * 100;
            const posY: number = (e.clientY - rect.top) / rect.height * 100;
            setMousePos({ posX, posY });
        };
        document.addEventListener("mousemove", getMousePos);
        return function cleanup() {
            document.removeEventListener("mousemove", getMousePos);
        };
    });
    return mousePos;
};
